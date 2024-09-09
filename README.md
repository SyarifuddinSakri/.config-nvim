This config is derived from starter nvim. I manually tweak the 'Tab' key to make it dynamically change it function.

1. When autosuggestion appears, pressing 'Tab' will automatically select the first selection.
2. If cursor if before closing characters, Ex:('}','"',''',';',']') pressing tab will skip the character, positioning it after that closing character
3. As i'm coding a lot with Java and using Maven build, this config is currently dedicated for that setup. But using other language should be fine, need only to install the language server for the used language.
