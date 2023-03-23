#Thomas Curtis
#DES algorithm

#1st argv = flag for encryption and decryption
#2nd argv = message to be encrypted
#3rd argv = file to write/read symmetric key from
#4th argv = file to write/read cipher from

#CLI: /path to program : 1 Pickle_Rick keyFile.txt cipherFile.txt
#     /path to program:  2 Pickle_Rick keyFile.txt cipherFile.txt

import sys
import pickle 
from des import DesKey

#generate symmetric key
symmetricKey = DesKey(b"security")

#writing symmetric key to file
keyFileName = open(sys.argv[3], "wb")
pickle.dump(symmetricKey, keyFileName)
keyFileName.close()

if sys.argv[1] == '1':
    print("Encrypting message ...")
 
    #encrypt
    msg = bytes(sys.argv[2], 'utf-8')
    print(msg)
    encryptMessage = symmetricKey.encrypt(msg, padding=True)
    
    #writing cipher to file
    cipherTextFileName = open(sys.argv[4],"wb")
    pickle.dump(encryptMessage, cipherTextFileName)
    cipherTextFileName.close()
    
if sys.argv[1] == '2':
    print("Decryption message ...")

    #reading symmetric key from file
    keyFileName = open(sys.argv[3], "rb")
    key = pickle.load(keyFileName)

    #get data from cipherTextFile.txt and put it in a var
    cipherTextFileName = open(sys.argv[4],"rb")
    data = pickle.load(cipherTextFileName)

    #decryption
    decryptMessage = key.decrypt(data, padding=True)
    print (decryptMessage)
