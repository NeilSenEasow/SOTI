def hello(name=None):
    if name==None or name=="":
        return "Hello, World!"
    
    return "Hello, "+name.capitalize()+"!"