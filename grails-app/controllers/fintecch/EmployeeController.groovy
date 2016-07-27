package fintecch

import org.apache.tools.ant.ProjectHelper

class EmployeeController {
  static defaultAction = "extra"
    def index() {
        println("i am in index actionn ")
      render "hello  index"
//    render "ttttttt"
      Employee employee
      employee = new Employee(params)
      //  render /fintech/fintech.gsp
    }
    def employ()
    {
      println "employ action "
      render "hello  employ"
    }
    def extra()
    {
        println "======== extra"
      render "hello  extra"

    }
}
