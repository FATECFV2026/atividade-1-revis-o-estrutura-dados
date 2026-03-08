#!/usr/bin/env bash
set -euo pipefail

MODE="${1:-}"
if [[ -z "$MODE" ]]; then
  echo "Uso: bash scripts/grade.sh <ex1|ex2|ex3|ex4>"
  exit 1
fi

mkdir -p bin
javac -d bin src/App.java autograde/Autograder.java
java -cp bin autograde.Autograder "$MODE"
