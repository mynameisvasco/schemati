#!/bin/bash
# Schemati installar for LINUX and OSX 
# Author: Vasco Sousa 
if [ "$(uname)" == "Darwin" ]; then
    if (( $EUID != 0 )); then
        echo "Please run as root"
        exit
    fi
    echo $(eval "cp Schemati.jar /usr/local/bin")
    echo $(eval "cp -R lib /usr/local/bin")
    echo $(eval "chmod +x schemati")
    echo $(eval "cp schemati /usr/local/bin")
    echo "Schemati installed with success!"
    echo "You can delete this folder."
    exit
elif [ "$(uname)" == "Linux" ]; then
    if (( $EUID != 0 )); then
        echo "Please run as root"
        exit
    fi
    echo $(eval "cp Schemati.jar /usr/local/bin")
    echo $(eval "cp -R lib /usr/local/bin")
    echo $(eval "chmod +x schemati")
    echo $(eval "cp schemati /usr/local/bin")
    echo "Schemati installed with success!"
    echo "You can delete this folder."
    exit

elif [ "$(expr substr $(uname -s) 1 10)" == "MINGW32_NT" ]; then
    echo $(eval "mkdir C:/Schemati")
    echo $(eval "cp Schemati.jar C:/Schemati")
    echo $(eval "cp -R lib C:/Schemati")
    echo $(eval "cp schemati C:/Schemati")
    echo "Schemati installed with success!"
    echo "Please add schemati file to PATH."
    exit

elif [ "$(expr substr $(uname -s) 1 10)" == "MINGW64_NT" ]; then
    echo $(eval "mkdir C:/Schemati")
    echo $(eval "cp Schemati.jar C:/Schemati")
    echo $(eval "cp -R lib C:/Schemati")
    echo $(eval "cp schemati C:/Schemati")
    echo "Schemati installed with success!"
    echo "Please add schemati file to PATH."
    exit
fi

