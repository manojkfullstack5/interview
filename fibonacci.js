function fibonacci(n) {
    if (n <= 0) return [];
    if (n === 1) return [0]; 
    const nums = [0, 1];
    while (true) {
        const nextNum = nums[nums.length - 1] + nums[nums.length - 2];
        if (nextNum > n) break;
        nums.push(nextNum);
    }
    return nums;
}
console.log(`Fibonacci numbers:`, fibonacci(21));
