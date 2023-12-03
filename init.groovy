import java.nio.file.Files
import java.nio.file.Paths

def jobDslScriptPath = '/var/jenkins_home/job_dsl.groovy'

if (Files.exists(Paths.get(jobDslScriptPath))) {
    def jobDslScript = new File(jobDslScriptPath).text
    def jobDsl = new javaposse.jobdsl.plugin.ExecuteDslScripts(
        new javaposse.jobdsl.plugin.ScriptRequest(jobDslScript, null, true)
    )

    def descriptor = Jenkins.getInstance().getDescriptorByType(javaposse.jobdsl.plugin.GlobalJobDslSecurityConfiguration.class)
    descriptor.setUseScriptSecurity(false)
    descriptor.save()

    def instance = Jenkins.instance
    def job = new hudson.model.FreeStyleProject(instance, "JobDSLRunner")
    job.getBuildersList().add(jobDsl)
    job.scheduleBuild2(0)
}
