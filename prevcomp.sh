#!/bin/bash
javac *.java --enable-preview --release 23
read drivername
java --enable-preview $drivername
