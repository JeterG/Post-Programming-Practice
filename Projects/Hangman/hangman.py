import time
def hangman():
    word = input("The word to guess: ").lower()
    game = "_"*len(word)
    word_map = {}
    def word_to_map():
        for index,char in enumerate(word):
            if char in word_map:
                word_map[char].append(index)
            else:
                word_map[char]=[index]
    word_to_map()
    game = ["_" for _ in word]
    play = True
    while play:
        guess = input("Guess a letter: ").lower() or " "
        if guess in word:
            for index in word_map[guess]:
                game[index]=guess
        combined = "".join(game)
        print(combined)
        if combined == word:
            play = False
    print(guess)

hangman()