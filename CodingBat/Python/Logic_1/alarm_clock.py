#Given a day of the week encoded as 0=sun, 1=mon, 2=tue, 6=sat and a bool indicatin if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm sould be "7:00" and on weekened it should be "10:00". Unless we are on vacation -- then on weekdays it shold be "10:00" and weekends it should be "off"
def alarm_clock(day, vacation):
    if vacation:
        if 1 <= day <=5:
            return "10:00"
        return "off"
    elif 1 <= day <= 5:
        return "7:00"
    return "10:00"