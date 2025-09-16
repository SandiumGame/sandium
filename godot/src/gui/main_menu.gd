extends MarginContainer
class_name MainMenu

func _on_credits_license_pressed():
	GuiManager.show_license()

func _on_exit_desktop_button_pressed():
	get_tree().quit()
