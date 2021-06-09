# Original question:

# You're writing code to control your town's traffic lights. Green -> yellow -> red -> green

# Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.

def update_light(current):
    if current == "green":
        return "yellow"
    elif current is "yellow":
        return "red"
    else:
        return "green"
