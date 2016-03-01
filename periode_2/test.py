###linked list

#class Node:
#    def __init__(self,value,tail):
#        self.value = value
#        self.tail = tail
#        self.isEmpty = False

#class Empty:
#    def __init__(self):
#        self.isEmpty = True

#list = Node(7,Node(5,Node(3, Empty())))

#templist = list

#while not templist.isEmpty:
#    print (templist.value)
#    templist = templist.tail

#print (list.tail.tail.value)

### recursive function with randomlist

#class Node:
#    def __init__(self,value,tail):
#        self.value = value
#        self.tail = tail
#        self.isEmpty = False

#class Empty:
#    def __init__(self):
#        self.isEmpty = True

#def randomList(n,m):
#    if n > m:
#        return Empty()
#    else:
#        return Node(n,randomList(n+1, m))

#list = randomList(2,6)
#templist = list
#while not templist.isEmpty:
#    print (templist.value)
#    templist = templist.tail

###recursive function

#def tel(number):
#    if number == 0:
#        print ("done")
#    else:
#        print (number)
#        return tel(number - 1)
#tel(10)

###attributen& methods

# class Auto:
#     def __init__(self,merk,band,thuis):
#         self.merk = merk
#         self.band = band
#         self.position = thuis
#
#
#     def rijden(self, destination):
#         self.position = destination
#
# class Band:
#     def __init__(self,merk, size):
#         self.merk = merk
#         self.size = size
#
# auto = Auto("Ford",Band("Michelin",17),(0,0))
#
# print (auto.position)
#
# auto.rijden((5,6))
#
# print (auto.position)

###interval
# def interval(n,m):
#     for i in range(n,m+1):
#         print (i)
# interval(3,6)

