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

        stage('echo') {
            logger.info("this is echo stage")
        }
    }
}
