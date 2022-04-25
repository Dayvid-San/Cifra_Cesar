word = 'teste'
teste = word[:1]

def divididor(word):
    acc = 1
    acc = acc +1
    if word[:acc] == ' ':
        print('')
    else:
        print(word[:acc])
        divididor(word[:acc])


def embaralhador(word):
    word.split(' ')
    