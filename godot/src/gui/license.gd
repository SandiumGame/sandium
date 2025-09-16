extends BaseDialog

var licenses: Dictionary
var copyrights: Array[Dictionary]

func _ready():
	var file = FileAccess.open("res://src/text/licenses/license.txt", FileAccess.READ)
	assert(file != null, "Failed to open file")
	%License.add_text(file.get_as_text())
	file.close()
	
	%ThirdPartyLicenses.add_item("Godot")
	
	licenses = Engine.get_license_info()
	copyrights = Engine.get_copyright_info()
	for copyright in copyrights:
		%ThirdPartyLicenses.add_item(copyright.get("name"))


func _on_third_party_licenses_item_selected(index: int) -> void:
	if index == 0:
		%ThirdPartyLicense.text = Engine.get_license_text()
	else:
		var text = ""
		var parts = copyrights[index-1].get("parts")
		for part in parts:
			var files = part.get("files")
			if files.size() > 0:
				text += "Source files in Godot Engine:\n"
				for file in files:
					text += "    " + file + "\n"
				text += "\n"
			
			var copyrights = part.get("copyright")
			if copyrights.size() > 0:
				text += "Copyright:\n"
				for copyright in copyrights:
					text += "    " + copyright + "\n"
				text += "\n"
			
			var license_name = part.get("license")
			text += "License: " + license_name + "\n\n"
			var license_text = licenses.get(license_name)
			if license_text != null:
				text += license_text
		%ThirdPartyLicense.text = text
