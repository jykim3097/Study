#!/usr/bin/env python
# coding: utf-8

# In[13]:


import requests #웹 상의 데이터를 처리할 때 필요한 모듈
from bs4 import BeautifulSoup

def spider(max_pages):
    page = 1
    while page < max_pages:
        url = 'http://creativeworks.tistory.com'+str(page)
        source_code = requests.get(url)
        print(source_code)
        
spider


# In[156]:


from urllib.request import Request, urlopen
from bs4 import BeautifulSoup
import re

req = Request('https://www.seoulwomanup.or.kr/womanup/edu/selectProgramPageListAll.do?currentPage=1&organPgName=&schOrganCode=&schCourseCode=&schDomainCode=&schGroupCode=&schEduSt=&schDayOfWeek=&schEduFee=&schLecturerName=&schClassName=')
res = urlopen(req)
html = res.read()

bs = BeautifulSoup(html, 'html.parser')
#print(bs)

# for string in bs.stripped_strings:
#     print(repr(string))
#cname = bs.findAll('dt')

# for tag in cname:
#     print("강좌명: ",tag.text)

#강좌명
#nth-child 안되고 nth-of-type 1~9
cname_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type(1) > div > dl > dt')[0]
cname = cname_tag.text
cname = cname.replace("\t","")
cname = cname.replace("\r","")
cname = cname.replace("\n","")

#초,중,고급, 자격, 관계없음 삭제
#맨 뒤에 글자가 급, 격 -> 뒤에 두글자 삭제
#맨 뒤에 글자가 음     -> 뒤에 네글자 삭제
# if (cname[len(cname)-1]=="급" or cname[len(cname)-1]=="격"):
#     cname=cname[0:len(cname)-2]
# elif (cname[len(cname)-1]=="음"):
#     cname=cname[0:len(cname)-4]
if (cname[len(cname)-1]=="음"):
    cname=cname[0:len(cname)-4]
else:
    cname=cname[0:len(cname)-2]

print(cname)

#교육기간
cterm_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type(1) > div > dl > dd:nth-of-type(5) > em')[0]
cterm = cterm_tag.text
cterm = cterm.replace("\t","")
cterm = cterm.replace("\r","")
cterm = cterm.replace("\n","")
print(cterm)

#교육시간
ctime_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type(1) > div > dl > dd:nth-of-type(6) > em')[0]
ctime = ctime_tag.text
print(ctime)

#수강료
cprice_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type(1) > div > dl > dd.line_bottom > em')[0]
cprice = cprice_tag.text
print(cprice)

#정원
cstatus_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type(1) > div > dl > dd:nth-of-type(3) > em')[0]
cstatus = cstatus_tag.text
print(cstatus)

#센터명
center_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type(1) > div > h2')[0]
center = center_tag.text
print(center)

#유형 ex)국비지원 등 -> 교육과정인가?
ctype_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type(1) > div > dl > dd:nth-of-type(1) > em')[0]
ctype = ctype_tag.text
print(ctype)

#신청/모집중
cstep_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type(1) > div > h4')[0]
cstep = cstep_tag.text
print(cstep)
url_tag =""
#detailsURL
url_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type(3) > div > a')[0]
url_tag = url_tag.get('onclick')
url_tag = url_tag.replace("application('","")
parts = url_tag.split("','")
part1 = parts[0]
part2 = parts[1]
dURL = part1 + "?class_code=" + part2
print(detailsURL)
        


# In[161]:


from urllib.request import Request, urlopen
from bs4 import BeautifulSoup
import re
url1 = 'https://www.seoulwomanup.or.kr/womanup/edu/selectProgramPageListAll.do?currentPage='
url2 = '&organPgName=&schOrganCode=&schCourseCode=&schDomainCode=&schGroupCode=&schEduSt=&schDayOfWeek=&schEduFee=&schLecturerName=&schClassName='

for i in range(1,3):
    req = Request(url1+str(i)+url2)
    res = urlopen(req)
    html = res.read()
    bs = BeautifulSoup(html, 'html.parser')

    for j in range(1,10):
        #강좌명
        cname_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type('+str(j)+') > div > dl > dt')[0]
        cname = cname_tag.text
        cname = cname.replace("\t","")
        cname = cname.replace("\r","")
        cname = cname.replace("\n","")

        #초,중,고급, 자격, 관계없음 삭제
        if (cname[len(cname)-1]=="음"):
            cname=cname[0:len(cname)-4]
        else:
            cname=cname[0:len(cname)-2]

        #교육기간
        cterm_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type('+str(j)+') > div > dl > dd:nth-of-type(5) > em')[0]
        cterm = cterm_tag.text
        cterm = cterm.replace("\t","")
        cterm = cterm.replace("\r","")
        cterm = cterm.replace("\n","")

        #교육시간
        ctime_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type('+str(j)+') > div > dl > dd:nth-of-type(6) > em')[0]
        ctime = ctime_tag.text

        #수강료
        cprice_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type('+str(j)+') > div > dl > dd.line_bottom > em')[0]
        cprice = cprice_tag.text

        #정원
        cstatus_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type('+str(j)+') > div > dl > dd:nth-of-type(3) > em')[0]
        cstatus = cstatus_tag.text

        #센터명
        center_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type('+str(j)+') > div > h2')[0]
        center = center_tag.text

        #유형 ex)국비지원 등 -> 교육과정인가?
        ctype_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type('+str(j)+') > div > dl > dd:nth-of-type(1) > em')[0]
        ctype = ctype_tag.text

        #신청/모집중
        cstep_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type('+str(j)+') > div > h4')[0]
        cstep = cstep_tag.text

        #detailsURL
        url_tag = bs.select('#sub > section > section > div > ul > li:nth-of-type('+str(j)+') > div > a')[0]
        if (url_tag.get('onclick')):
            url_tag = url_tag.get('onclick')
            url_tag = url_tag.replace("application('","")
            parts = url_tag.split("','")
            part1 = parts[0]
            part2 = parts[1]
            detailsURL = part1 + "?class_code=" + part2
        
        print(cname)
        print(cterm)
        print(ctime)
        print(cprice)
        print(cstatus)
        print(center)
        print(ctype)
        print(cstep)
        print(detailsURL+"\n")
        

