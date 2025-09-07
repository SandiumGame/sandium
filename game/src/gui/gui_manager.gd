extends Node

var main_menu: MainMenu

func _ready():
	main_menu = ResourceLoader.load("res://src/gui/main_menu.tscn").instantiate()
	
func show_main_menu():
	get_tree().get_root().add_child(main_menu)
	
func hide_main_menu():
	get_tree().get_root().remove_child(main_menu)

func show_credits():
	var credits = ResourceLoader.load("res://src/gui/main_menu.tscn").instantiate()
	get_tree().get_root().add_child(credits)
