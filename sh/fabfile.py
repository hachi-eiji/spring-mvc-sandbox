from fabric.api import local,run, task
from fabric.state import env
from fabric.decorators import task
from fabric.colors import *
from fabric.state import env

@task
def mvn_test():
    local("mvn clean test")
    print(green("finish test"))

@task
def mvn_deploy():
    local("mvn clean package")
