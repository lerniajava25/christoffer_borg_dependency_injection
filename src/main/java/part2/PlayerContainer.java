package part2;

import output.AudioOutput;
import output.SpeakerOutput;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class PlayerContainer {

    public Object playerContainer(Class<?> clazz)
            throws InvocationTargetException, InstantiationException, IllegalAccessException {

        if (clazz == AudioOutput.class) {
            clazz = SpeakerOutput.class;
        }
        Constructor<?> constructor = clazz.getDeclaredConstructors()[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] dependencies = Arrays.stream(parameterTypes)
                .map(parameterType -> {
                    try {
                        return playerContainer(parameterType);
                    } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toArray();
        return constructor.newInstance(dependencies);
    }
}
