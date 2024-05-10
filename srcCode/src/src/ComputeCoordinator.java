package src;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class ComputeCoordinator implements ComputationCoordinator {

	private final DataStorageAPI ds;
	private final ComputeEngineAPI ce;

	public ComputeCoordinator() {
		this.ds = new DataStorageAPI();
		this.ce = new ComputeEngineAPI();
	}

//	@Override
//	public ComputingResult run(FileInput input, char delimiter) {
//		ExecutorService threadPool =Executors.newFixedThreadPool(3);
//		List<Future<?>> exceptionChecker= new ArrayList<>();
//		Iterable<Integer> integers = ds.read(input);
//		//final String result = "";
//		FileOutput output= new FileOutput("largeOutput.txt");
//		for(int i : integers) {
//			Callable<Void> startRun= () -> {
//				String result= "";
//				result = result + ce.compute(i); // got rid of delimiter
//				ds.userTranslate(output, result, delimiter);
//				return null;
//			};
//			exceptionChecker.add(threadPool.submit(startRun));
//		}exceptionChecker.forEach(future-> {
//			try {
//				future.get();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
//		return ComputingResult.SUCCESS;
//		//System.out.println("Output: " + result);
//	}
	
	private Semaphore semaphore = new Semaphore(1);
	@Override
    public ComputingResult run(FileInput input, char delimiter) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        List<Future<String>> exceptionChecker = new ArrayList<>();
        Iterable<Integer> integers = ds.read(input);
        FileOutput output = new FileOutput("largeOutput.txt");

        for (int i : integers) {
            Callable<String> startRun = () -> {
            	if(i != (int)i) {
                    System.out.println("Error - Wrong input: " + i);
                }
                return ce.compute(i);
            };
            exceptionChecker.add(threadPool.submit(startRun));
        }
        
        exceptionChecker.forEach(future -> {
            try {
                String result= future.get();
                ds.userTranslate(output, result, delimiter);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        return ComputingResult.SUCCESS;
    }
	
//	@Override
//	public ComputingResult run(FileInput input, char delimiter) {
//	    ExecutorService threadPool = Executors.newFixedThreadPool(3);
//	    List<Future<?>> exceptionChecker = new ArrayList<>();
//	    Iterable<Integer> integers = ds.read(input);
//	    Object lock = new Object(); // Lock object for synchronization
//        FileOutput output = new FileOutput("largeOutput.txt");
//	    for (int i : integers) {
//	        Callable<Void> startRun = () -> {
//	            String result = " ";
//	            result = result + ce.compute(i);
//	            synchronized(lock) {
//	                ds.userTranslate(output, result, delimiter);
//	            }
//	            return null;
//	        };
//	        exceptionChecker.add(threadPool.submit(startRun));
//	    }exceptionChecker.forEach(future-> {
//			try {
//			future.get();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	});
//	    threadPool.shutdown();
//	    return ComputingResult.SUCCESS;
//	}
	
//	@Override
//	public ComputingResult run(FileInput input, char delimiter) {
//	    ExecutorService computeThreadPool = Executors.newFixedThreadPool(3);
//	    ExecutorService outputExecutor 
	//= Executors.newSingleThreadExecutor(); 
	// Ensures ordered execution of output tasks
//	    List<Future<?>> futures = new ArrayList<>();
//	    Iterable<Integer> integers = ds.read(input);
//
//	    for (int i : integers) {
//	        futures.add(computeThreadPool.submit(() -> {
//	            String result = "";
//	            result = result + ce.compute(i) + delimiter;
//	            outputExecutor.submit(() -> {
//	                FileOutput output = new FileOutput("runTestOutput.txt.temp");
//	                ds.userTranslate(output, result, delimiter);
//	            });
//	        }));
//	    }
//
//	    // Wait for all tasks to complete
//	    for (Future<?> future : futures) {
//	        try {
//	            future.get(); 
	// Ensures that any exceptions thrown during task execution are handled
//	        } catch (InterruptedException | ExecutionException e) {
//	            e.printStackTrace(); // Proper exception handling should be implemented
//	        }
//	    }
//
//	    computeThreadPool.shutdown();
//	    outputExecutor.shutdown();
//
//	    try {
//	        computeThreadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
//	        outputExecutor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
//	    } catch (InterruptedException e) {
//	        Thread.currentThread().interrupt(); // Restore interrupted status
//	    }
//
//	    return ComputingResult.SUCCESS;
//	}

	public ComputingResult run(FileInput input, FileOutput output, char delimiter) {
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		List<Future<?>> exceptionChecker= new ArrayList<>();
		Iterable<Integer> integers = ds.read(input);
		//final String result = "";
		for(int i : integers) {
			Callable<Void> startRun= () -> {
				String result= " ";
				result = result + ce.compute(i) + delimiter;
				ds.userTranslate(output, result, delimiter);
				return null;

			};
		
			exceptionChecker.add(threadPool.submit(startRun));
		}
			exceptionChecker.forEach(future-> {
				try {
					future.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			return ComputingResult.SUCCESS;
			}
			//System.out.println("Output: " + result);


		public ComputingResult run(FileInput input, 
				FileOutput output, char delimiter, int numThreads) {
			ExecutorService threadPool = Executors.newFixedThreadPool(numThreads);
			List<Future<?>> exceptionChecker = new ArrayList<>();
			Iterable<Integer> integers = ds.read(input);
			// final String result = "";
			for (int i : integers) {
				Callable<Void> startRun = () -> {
					String result = " ";
					result = result + ce.compute(i);
					ds.userTranslate(output, result, delimiter);
					return null;
				};
				exceptionChecker.add(threadPool.submit(startRun));
			}
			return ComputingResult.SUCCESS;
			// System.out.println("Output: " + result);
		}

		public ComputingResult run(FileInput input) {
			ExecutorService threadPool = Executors.newFixedThreadPool(3);
			List<Future<?>> exceptionChecker = new ArrayList<>();
			Iterable<Integer> integers = ds.read(input);
			// final String result = "";
			for (int i : integers) {
				Callable<Void> startRun = () -> {
					String result = " ";
					result = result + ce.compute(i) + ',';
					FileOutput output = 
							new FileOutput("runTestOutput.txt.temp");
					ds.userTranslate(output, result, ',');
					return null;
				};
				exceptionChecker.add(threadPool.submit(startRun));
			}
			return ComputingResult.SUCCESS;
			// System.out.println("Output: " + result);
		}

	}


