import random

while True:
    words = ["the blockchain", "AI", "machine learning", "neural net", "DNS server", "an API", "coding and algorithms"]
    choice = input("Would you like predetermined words? (Y/N): ")
    if choice.lower() == "n" or choice.lower() == "no" or choice.lower() == "y" or choice.lower() == "yes":
        random.shuffle(words)
        if choice.lower() == "n" or choice.lower() == "no":
            for i in range (0, len(words)):
                words[i] = input("Please enter a word (" + str(i+1) + "/7): ")
        print("Me, was pretty easy. Used " + words[0] + " to occupy space on the Reddit network."
              + " Once traffic came through for that account I flipped the " + words[1] + " to my PC"
              + " and harvested the password as it was being transmitted. I also employed " + words[2]
              + " to gain " + words[3] + " access on their network."
              + " From there it was a simple job of breaking through " + words[4] + "s and getting"
              + " into local " + words[5] + " accounts."
              + " Grabbed a few passwords and started hacking with " + words[6] + ".")
    else:
        print("Invalid option.")
