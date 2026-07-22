grep 


owner - read+write
group - read
other - x
abs vs relative 
/  - root
~ - home

Life before VCS
- No visibility 
- loss of data / no centralized data
- No history
- No undo
- team collision

Github ??? Gitlab .... Bitbucket
Git - tracks code changes
It is a distributed version control system.
VCS -> it tracks, manage & control source code.

Linus Torvalds


3 areas of the GIT
- Working directory -> the actual files which you can edit on your computer
- staging area -> a holding area, files you have selected to be part of next stage
- Repository -> the permanent history

git init -> create a git repository
git add -> move file from working dir to staging area
git rm --cached filename -> remove file from staging area and put it in working directory
git commit -m "msg" -> commit the files
git status -> check the git status
git log -> tells the log of the git commit
git push -> send code to remote repo

Untracked -> new file and git doesn,t know anything about it 
Staged -> Added to staging area, ready to commit
Committed -> save permanently in local repo history
pushed -> sent to github

Commit ? capture the moment of code at a particular time
Local repo ------> Staging area -------> Local commit -----> Remote repository

fixed stuuff... add file... update 

Fix login validation bug for empty password

# Exercise to do
create a new folder and make it git repo
create a file and make some change in it
check git status
Add your files to staging area
Commit your changes
check the git status
create a new file and make some changes and commit 
check git logs 

Local repository -> the copy on ur laptop/desktop
remote repository -> the copy hosted on github server

git clone - remote to local
create branches
make your chnages 
add changes to staging area
commit the chnages
push the changes


git pull
git add
git commit 
git push


KT -> knowledge transfer
