def correct_polish_letters(st): 
    str = ""
    n = len(st)
    for i in range(0,n):
        if(st[i]) == "ą":
            str+="a"
        elif(st[i]) == "ć":
            str+="c"
        elif(st[i]) == "ę":
            str+="e"
        elif(st[i]) == "ł":
            str+="l"
        elif(st[i]) == "ń":
            str+="n"
        elif(st[i]) == "ó":
            str+="o"
        elif(st[i]) == "ś":
            str+="s"
        elif(st[i]) == "ź":
            str+="z"
        elif(st[i]) == "ż":
            str+="z"
        else:
            str+=st[i]
    return str

@test.describe('Example Tests')
def example_tests():
    test.assert_equals(correct_polish_letters("Jędrzej Błądziński"),"Jedrzej Bladzinski");
    test.assert_equals(correct_polish_letters("Lech Wałęsa"),"Lech Walesa");
    test.assert_equals(correct_polish_letters("Maria Skłodowska-Curie"),"Maria Sklodowska-Curie")