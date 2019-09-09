# Little-Search-Engine
This project goes through multiple text files, and will return the text files in descending order based on the frequency a given pair of words appears in the document.

This program goes through all documents provided by the user, then prompts the user to input two words. After inputting these two words, it will return the documents where those two words appear the most. In order to avoid redundant words such as transitions or prepositions, there is a noisewords file that prevents the hashtable from hashing unnecessary words. After going through all the documents, the search engine will return the top five documents in descending order for count of how often the given words appear in each document.
