<template>
    <table>
        <thead>
            <tr>
                <th v-for="(info, index) in headerInfo" v-bind:key="index">{{ info }}</th>
            </tr>
        </thead>
        <tbody>
            <template v-for="(empInfo, index) in empList">
                <tr v-bind:key="index">
                    <td v-for="(info, index) in headerInfo" v-bind:key="index">{{ empInfo[info] }}</td>
                </tr>
            </template>
        </tbody>
    </table>
</template>

<script>
import { response } from 'express';

export default {
    name : 'EmpAllList',
    data : function() {
        return {
            headerInfo : ['employeeId', 'firstName', 'lastName', 'email', 'jobId'],
            empList : []
        }
    },
    created : function() {
        fetch('http://localhost:8080/emps')
        .then(response => response.json())
        .then(data => this.empList = data);
    }
}
</script>

<style scoped>
    table, tr, tr, td {
        border : 1px solid black;
    }
</style>