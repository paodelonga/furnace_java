#!/usr/bin/bash

red='\033[1;31m'
yellow='\033[1;33m'
reset='\033[0;0m'

SRC_DIR="$PWD/src/main/java"
PACKAGE_NAME=$(head /dev/urandom | tr -dc A-Za-z | head -c 8)
PACKAGE_PATH="$SRC_DIR/$PACKAGE_NAME"
PACKAGE_FILEPATH="$PACKAGE_PATH/Main.java"

PACKAGE_TEMPLATE="""public class Main {
    public static void main(String[] args) {
    }
}"""

if [[ ! -e $PACKAGE_PATH ]]; then
  mkdir "$PACKAGE_PATH"
  echo "$PACKAGE_TEMPLATE" > "$PACKAGE_FILEPATH"
  echo -e "${yellow}Package created at $PACKAGE_FILEPATH${reset}"
else
  echo -e "${red}Package exists at $PACKAGE_FILEPATH${reset}"
fi
