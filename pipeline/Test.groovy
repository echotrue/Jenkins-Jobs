@Library('shared@master')

import org.dgame.jenkins.pipeline.JenkinsHelper
import org.dgame.jenkins.pipeline.Logger

def helper = new JenkinsHelper(this)
def logger = new Logger(this)

node {

    def formOptions = []
    def taskProperties = []

    formOptions.add(booleanParam(name: 'Production', defaultValue: false, description: '是否打最终包？'))

    taskProperties.add(parameters(formOptions))

    properties(taskProperties)


    ansiColor('xterm') {
        stage('init') {
            helper.say()
        }

        stage('build') {
            logger.info("this is echo stage")
        }

        stage('sync') {
            logger.debug("已同步到测试服")
        }
    }
}
