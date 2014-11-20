from fabric.api import local,run, task
from fabric.state import env
from fabric.decorators import task
from fabric.colors import *
from fabric.state import env

@task
def mvn_test():
    local("mvn clean test")
    print(green("mvn_test"))

@task
def mvn_deploy():
    print(green("mvn_deploy"))
