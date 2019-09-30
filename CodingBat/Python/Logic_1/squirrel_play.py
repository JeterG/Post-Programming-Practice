#The squirrels in Palo Alto spend most of the day playing. In particular, the yplay if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int tmperature and a boolean is_summer, return True if the squirrels play and False otherwise.
def squirrel_play(temp, is_summer):
    if is_summer:
        return  60 <= temp <= 100
    return 60 <= temp <= 90
            