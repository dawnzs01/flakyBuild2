#!/bin/sh

git remote add upstream git@github.com:EdurtIO/datacap.git
git remote -v
git fetch upstream
git merge upstream/dev
