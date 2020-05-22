import os

from EnglishCode.Extract_Words import Extract_Folders_Path
from EnglishCode.Contrl_Mysql import Add_Words_To_Mysql, Add_Words_To_Text

if (__name__ == "__main__"):
    # 单词频率记录字典

    path1 = r"C:\Users\hanhan\Desktop\python-3.8.3rc1-docs-html"
    path2= r"C:\Users\hanhan\Desktop\jdk-14.0.1_doc-all"
    path3 = r"C:\Users\hanhan\Desktop\refman-8.0-en.html-chapter"

    wordDict = dict()
    # Extract_Folders_Path(path1, wordDict)
    # Extract_Folders_Path(path2,wordDict)
    Extract_Folders_Path(path3,wordDict)
    print(wordDict)
    # Add_Words_To_Mysql(wordDict)
    # Add_Words_To_Text("word.txt")
    #
    #
