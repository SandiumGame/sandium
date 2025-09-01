extends Node

func _ready():
	get_tree().auto_accept_quit = false;

	# Parse command line arguments	
	var arguments = {"language": "automatic"}
	for argument in OS.get_cmdline_args():
		if argument.contains("="):
			var key_value = argument.split("=")
			arguments[key_value[0].trim_prefix("--")] = key_value[1]
		else:
			arguments[argument.trim_prefix("--")] = ""
		

	if arguments.has("help"):
		print("Command line arguments")
		print("")
		print("--language=<code> Run with specific language. Code is the 2 character language code such as \"en\"")
		get_tree().quit()
		return
	
	# Load here language from the user settings file
	if arguments["language"] == "automatic":
		# TODO Load language from settings file
		var preferred_language = OS.get_locale_language()
		TranslationServer.set_locale(preferred_language)
	else:
		TranslationServer.set_locale(arguments["language"])
	
	
