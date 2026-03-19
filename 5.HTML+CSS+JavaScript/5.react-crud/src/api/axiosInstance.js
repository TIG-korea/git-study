import axios from 'axios';

const axiosInstance = axios.create({
    baseURL: 'https://dnoqc0iz9qmi5.cloudfront.net',
    timeout: 10000,
    headers:{
        'Content-Type' : 'application/json'
    }
})

export default axiosInstance;