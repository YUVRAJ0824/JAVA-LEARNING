# GIT COMMAND LIST

---

## SETUP (once only)
git config --global user.name "YourName"
git config --global user.email "you@email.com"

---

## START
git init                          // new repo in current folder
git clone <url>                   // download repo from GitHub
git remote add origin <url>       // link local folder to GitHub

---

## DAILY FLOW
git status                        // see what changed
git add .                         // stage all files
git add filename.txt              // stage one file
git commit -m "message here"      // save with message
git push                          // send to GitHub
git pull                          // get latest from GitHub

---

## REMOVE
git rm filename.txt               // delete from git AND computer
git rm --cached filename.txt      // remove from git only (keep on PC)

---

## UNDO
git restore --staged filename.txt // unstage (undo git add)
git restore filename.txt          // discard changes in file
git reset --soft HEAD~1           // undo last commit (keep files)

---

## BRANCHES
git branch                        // see all branches
git checkout -b branch-name       // create + switch to branch
git switch branch-name            // switch to existing branch
git merge branch-name             // merge into current branch
git branch -d branch-name         // delete branch

---

## COMMIT MESSAGE TYPES
feat:      // new feature
fix:       // bug fix
update:    // changed something
docs:      // added comments or notes
remove:    // deleted something
style:     // formatting only

// Examples:
git commit -m "feat: add TYPE_CONVERSION.java"
git commit -m "docs: add core rules comment"
git commit -m "fix: rename duplicate variable"

---

## EXTRAS
git log --oneline                 // see commit history short
git diff                          // see unstaged changes
git stash                         // save work temporarily
git stash pop                     // bring stash back
git remote -v                     // see GitHub link

---

// .gitignore — create this file and add lines to ignore files:
// *.class
// .idea/
// out/
