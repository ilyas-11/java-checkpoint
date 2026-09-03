.RECIPEPREFIX := >

# ==========================================

# Java Exercise Tester

# ==========================================

#

# 1 -> Setup:

# make setup

# 2 -> Usage:

# make test pr=checkpoint-01-java/Level-01/UniversalGreeting

# Example:

# make test pr=checkpoint-01-java/Level-01/AverageCalc

setup:

> docker pull ghcr.io/01-edu/test-java:latest

test:

> @test -n "$(pr)" || { echo "Usage: make test pr=checkpoint-01-java/Level-01/UniversalGreeting"; exit 1; }
> @rm -rf student
> @mkdir -p student
> @cp -r "$(pr)" student/
> @docker run --rm -e EXERCISE="$(notdir $(pr))" -v "$(PWD)/student:/app/student" ghcr.io/01-edu/test-java:latest
> @rm -rf student
/*
#
$pr = "DoubleLinkedList"

Remove-Item -Recurse -Force student -ErrorAction SilentlyContinue

New-Item -ItemType Directory -Force "student\$pr"

Copy-Item "$pr\*.java" "student\$pr\"

docker run --rm `
    -e "EXERCISE=$pr" `
    --mount "type=bind,source=$((Get-Location).Path)\student,target=/app/student" `
    ghcr.io/01-edu/test-java:latest

Remove-Item -Recurse -Force student