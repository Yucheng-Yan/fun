#include "employee.h"
#include <stdio.h>
#include <string.h>

#define MAX 3        
static int error = 0;      
static int ptr;         
static struct Employee {
    char last[16];
    char first[11];
    char title[16];
    int salary;
}Employee;

static struct Employee emps[MAX];

int addEmployee(void){

    if (ptr < MAX) {
        printf("Enter last: "); fflush(stdout);
        gets(emps[ptr].last);
        printf("Enter first: "); fflush(stdout);
        gets(emps[ptr].first);
        printf("Enter title: "); fflush(stdout);
        gets(emps[ptr].title);
        printf("Enter salary: "); fflush(stdout);
        scanf("%d", &emps[ptr].salary);
        getchar();
        return ptr++;
    }

    else {
        return -1;
    }

}

int printEmployee(int i) {
    if (i < MAX) {
        printf("{%s, %s, %s, %d}\n",
                emps[i].last,
                emps[i].first,
                emps[i].title,
                emps[i].salary);
    }
    else {
        return -1;
    }
    
}


int numEmployees(void){
    return ptr;
}