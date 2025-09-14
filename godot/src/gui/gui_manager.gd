extends Node

var main_menu: MainMenu

func _ready():
	main_menu = ResourceLoader.load("res://src/gui/main_menu.tscn").instantiate()
	
func show_main_menu():
	get_tree().get_root().add_child(main_menu)
	
func hide_main_menu():
	get_tree().get_root().remove_child(main_menu)

func show_credits():
	var credits = ResourceLoader.load("res://src/gui/credits.tscn").instantiate()
	show_dialog(credits)

func show_dialog(dialog: BaseDialog):
	if dialog.window == null:
		_show_dialog_with_parent_window(dialog, Engine.get_main_loop().root)
	else:
		dialog.window.Exclusive = true
		dialog.window.Visible = true

func close_dialog(dialog: BaseDialog):
	if dialog.window == null:
		return

	dialog.window.queue_free()
	dialog.window.exclusive = false
	dialog.window = null
	
func show_dialog_with_parent(dialog: BaseDialog, parent: BaseDialog):
	pass

func _show_dialog_with_parent_window(dialog: BaseDialog, parent: Window):
	assert(dialog.window == null, "Dialog has already been shown")

	# Create Window for the dialog
	var window = Window.new()
	dialog.window = window
	window.borderless = true
	window.exclusive = true
	window.transient = true
	window.size = Vector2i(int(dialog.size.x), int(dialog.size.y))
	window.gui_embed_subwindows = true
	window.add_child(dialog)
	parent.add_child(window)

	# Center window
	var window_size = window.get_viewport().get_visible_rect().size
	var viewport_size = parent.get_viewport().get_visible_rect().size
	window.position = Vector2i((viewport_size.x - window_size.x) / 2, (viewport_size.y - window_size.y) / 2)
