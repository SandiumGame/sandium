extends BaseDialog

func _ready():
	var file = FileAccess.open("res://src/text/licenses/credits.txt", FileAccess.READ)
	assert(file != null, "Failed to open file")
	%Credits.add_text(file.get_as_text())
	file.close()
	
