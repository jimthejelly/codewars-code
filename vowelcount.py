# Original question:

# Return the number (count) of vowels in the given string.
# We will consider a, e, i, o, u as vowels

# The input string will only consist of lower case letters and/or spaces.

def get_count(input_str):
    num_vowels = 0
    # your code here
    
    for x in range(0, len(input_str)):
        if(input_str[x:x+1] == "a" or input_str[x:x+1] == "e" or input_str[x:x+1] == "i" or input_str[x:x+1] == "o" or input_str[x:x+1] == "u"):
            num_vowels += 1
    
    return num_vowels
