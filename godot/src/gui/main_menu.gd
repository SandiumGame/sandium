extends MarginContainer
class_name MainMenu

func _on_credits_button_pressed():
	GuiManager.show_credits()

func _on_exit_desktop_button_pressed():
	get_tree().quit()
