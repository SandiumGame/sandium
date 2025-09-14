extends PanelContainer
class_name BaseDialog

var window: Window

func _on_close_button_pressed():
	GuiManager.close_dialog(self)
