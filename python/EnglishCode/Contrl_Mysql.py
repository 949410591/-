import sqlalchemy
from sqlalchemy import create_engine,Table, Column, Integer, String, MetaData, ForeignKey,VARCHAR
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker
engine = create_engine("mysql+mysqlconnector://root:root@localhost:3306/english", echo=True)
Session = sessionmaker(bind=engine)
Base = declarative_base()
session = Session()

class Words(Base):
        __tablename__ = "words"
        word  = Column(VARCHAR(100),primary_key=True)
        Frequency = Column(Integer)

        def __repr__(self) -> str:
            return super().__repr__()



def Add_Words_To_Mysql(wordDict):
    # Base.metadata.drop_all(engine)
    # Base.metadata.create_all(engine)

    add_List = []
    for key in wordDict:
        #查询mysql看是否该词有记录
        a = session.query(Words).filter(Words.word==key).all()
        #有记录就更新频率
        if (a):
            session.query(Words).filter(Words.word==key).update({"Frequency":a[0].Frequency+wordDict[key]})
        #没有记录就插入
        else:
            add_List.append(Words(word = key,Frequency=wordDict[key]))
    session.add_all(add_List)
    session.commit()

def Add_Words_To_Text(fname):

    with open(fname,mode = 'w',encoding="utf-8") as f:
        #查询出现次数大于等于num的单词
        num = 1
        f.write("#生词本{0}\n".format(1))
        for i in session.query(Words.word).order_by(Words.Frequency.desc()):

            if(num%1000 == 0):
                f.write("#生词本{0}\n".format(num//1000+1))
            f.write(i[0]+"\n")
            num += 1



if(__name__ == "__main__"):
    Add_Words_To_Text("word.txt")
