@Library('shared@master')

import org.dgame.jenkins.pipeline.JenkinsHelper
import org.dgame.jenkins.pipeline.Logger

def helper = new JenkinsHelper(this)
def logger = new Logger(this)

node {
    ansiColor('xterm') {
        stage('init') {
            helper.say()
        }

        stage('build') {
            logger.info("this is echo stage")
        }

        stage('sync'){
            logger.debug("已同步到测试服")
        }
    }
}
