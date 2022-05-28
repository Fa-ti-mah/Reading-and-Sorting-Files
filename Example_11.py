
'''text = open('C:/Users/DELL/Desktop/New folder/wordlist.txt').read()
wordlist = text.split()
print(wordlist)
for word in wordlist:
    if len(word) == 3:
        print(word)

for word in wordlist:
    if word[:2] == 'gn' or word[:2] == 'kn':
        print(word)

count = 0
for word in wordlist:
    if word[0] in 'aeiou':
        count = count+1
print(100*count/len(wordlist))
print(count)
print(len(wordlist))'''

text = open('C:/Users/DELL/Desktop/New folder/wordlist2.txt').read()
wordlist = text.split()
print(wordlist)
for word in wordlist:
    if len(word) == 7 and word[:2] == 'th' and word[-2:] == 'ly':
        print(word)

text = open('C:/Users/DELL/Desktop/New folder/wordlist.txt').read()
wordlist = text.split()

largest = 0
for word in wordlist:
    for c in word:
        if c not in 'abcde':
            break
    else:
        if len(word) > largest:
            largest = len(word)
            largest_word = word
print(largest_word)
