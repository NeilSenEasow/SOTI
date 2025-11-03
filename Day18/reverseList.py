def reverse_list(l):
    list=[]
    for i in range(len(l)-1,-1,-1):
        list.append(l[i])
    return list