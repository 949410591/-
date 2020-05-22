#获取所有的文档文件路径
import os

from bs4 import BeautifulSoup

import re

#提取所有文件夹的路径
def Extract_Folders_Path(SuperPath,wordDict):
    #获取改路径下所有文件夹的路径

    for SubPath in os.walk(SuperPath):
        #排除"_xxx"类型的文件夹

        if(SubPath[0].find(r"\_") != -1):
            continue
        #提取文件夹所有文件的单词
        print(SubPath[0])
        Extract_File_Word(SubPath[0],wordDict)
    # 按照字典值从大到小排序

    words = sorted(wordDict.items(), key=lambda x: x[1], reverse=True)
    wordDict = dict(words)





#提取文件夹所有文件的单词
def Extract_File_Word(path,wordDict):

    #获取所有文件名
    flist = os.listdir(path)



    #获取所有文件路径

    for i in range(len(flist)):
       flist[i]  = path+"\\"+flist[i]



    for f_path in flist:
        print("   "+f_path)
        #排除所有非html文件
        if(not f_path.endswith(".html")):
            continue

        with open(f_path,encoding="utf-8") as a:
            soup = BeautifulSoup(a,"lxml")
            #获取网页文件的文本信息
            text = soup.get_text().lower()
            #去除所有\u200b 字符
            # text = text.replace("\u200b"," ")
            #使用re提取所有的英文单词

            words = re.findall("[a-z][a-z]+",text)


            #转换为集合去重
            words = set(words)
            #遍历单词集合，记录单词频率
            for word in words:
                wordDict.setdefault(word,0)
                wordDict[word] +=1









