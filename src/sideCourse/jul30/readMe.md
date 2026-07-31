merge 
branch 
fetch vs pull (fetch + merge)

git and github 
push ?


Stash -> storing the changes temporarily at a location

git stash -> saving changes at temp location
git stash pop -> retrieving changes back from temp location


PR -> Pull request is area to merge changes from one branch to another after a review.

/*
clone/pull this project
create a feature branch from master
add var school name and param-constructor
commit the changes and push to github
create a PR to merge to master branch
*/

Usual-Flow 

- Clone the repo or pull the changes or fetch the changes
- Create a feature branch from main/develop
- make the changes in the feature branch
- Add and commit the changes to feature branch
- push the feature branch to remote/github but set the upstream first and it is a one time activity for each new branch
- create a PR to merge changes to master/main/develop
- Team will review your changes
- Approved
- Merge

reset - Not shared with others (not pushed yet) ---- deletes the commit history
revert - Already shared the changes with the team (pushed your changes) ---- it maintains the commit history


C1 - C2 - C3 - C4 - C5 (C2)

git reset --hard 445111ef21e29dd4892c64d5319640a58b02e3fa
git revert 445111ef21e29dd4892c64d5319640a58b02e3fa



sahidhwkhoidw

