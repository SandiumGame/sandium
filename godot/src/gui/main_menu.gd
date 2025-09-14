extends MarginContainer
class_name MainMenu

func _on_credits_button_pressed() -> void:
	GameManager.test()
	pass # Replace with function body.

func _on_exit_desktop_button_pressed() -> void:
	get_tree().quit()
