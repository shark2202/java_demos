%module HelloWord4j/* 这里要设置为C++项目名称 */

%include <windows.i>

%{
/* i文件中（例如变量类型）使用到的头文件 */
#include "helloWorld.h"
%}

/* SWIG要解析的头文件 */
%include "helloWorld.h"