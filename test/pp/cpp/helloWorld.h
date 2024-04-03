#pragma once

#ifdef DLL_EXPORTS
#define DLL_API __declspec(dllexport)
#else
#define DLL_API __declspec(dllimport)
#endif

/* C++对象方法*/
class DLL_API  HelloWorld
{
public:
	int add(int a, int b);
};

/*全局函数*/
DLL_API int multiply(int a, int b);

DLL_API int var_dump(int);
