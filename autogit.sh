#!/bin/bash

git status
sleep 1
git add .
git status
sleep 1

myCommit=$1
git commit -m "$myCommit"
sleep 2
git push


