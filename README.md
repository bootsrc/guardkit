# guardkit

基于Java的监控框架

用于监控代码片段

调试运行<code>om.lsm.guardkit.test.GuardTest</code>，结果如下
```text
EagleEye init!
Hello guardkit!
>>>StatLogRollingTask isRunning>>>
>>>StatLogRollingTask isRunning>>>
>>>StatLogRollingTask isRunning>>>
>>>StatLogRollingTask isRunning>>>
>>>StatLogRollingTask isRunning>>>
>>>StatLogRollingTask isRunning>>>
>>>StatLogRollingTask isRunning>>>
>>>StatLogRollingTask isRunning>>>
>>>StatLogRollingTask isRunning>>>
```
## 代码解析
StatLogController中变量rollerThreadPool实现了一个线程池这个线程池里永远只有一个线程在持续运行着，类型是<code><StatLogRollingTask/code>
