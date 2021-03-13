# Car-trust-interview-task
This repository contains a task which is a demo of observer design pattern and is solely developed for the purpose of a interview

## Introduction
This project is based on an idea that how a new car registration can be handled and how further processes with different departments from CarTrust can be made more efficient and smooth

## Idea
In the eco-system considering maybe once a car is registered with CarTrust, its file is send to multiple different departments and this happens manually or through a process which takes time, one can easily make a service which does that for us automatically and we don't have to work for it, once a car is registered, all the departments related to it, or all the departments those are related to it will get notified about it and can start their work promptly

## Structure
This project has 2 main packages and those packages are named according to their work, there's also a class named CarTrustDemo which is located in base Application package where these 2 packages are located

### observable
This package contains CarRegisteryObservable class which extends from builtin observable class (now this is Deprecated) and performs the task of registration of the cars and later on updating observers for their changes


### observers
This package contains multiple observer classes and they are example of the multiple departments involved during the CarTrust car registration process

### CarTrustDemo
This class initiates the process of the updating the CarRegisteryObservable and informing all the departments about a potential registration of a car in the system


## Future Work
This can be enhanced in many ways by adding the handling of used cars, by increasing the number of departments and also evolving the project to do many tasks 
